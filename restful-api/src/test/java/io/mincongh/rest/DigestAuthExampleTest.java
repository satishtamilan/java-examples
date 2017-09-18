package io.mincongh.rest;

import static org.assertj.core.api.Assertions.assertThat;

import io.mincongh.rest.DigestAuthExample.Digest;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Mincong Huang
 */
public class DigestAuthExampleTest {

  private HttpServer server;

  private WebTarget authApi;

  @Before
  public void setUp() throws Exception {
    server = Main.startServer();
    authApi = ClientBuilder.newClient().target(Main.HTTP_DIGEST_AUTH_URI);
  }

  @After
  public void tearDown() throws Exception {
    server.shutdownNow();
  }

  @Test
  public void getSalesReport_authFailed_noDigest() throws Exception {
    Response r = authApi.path("sales123").request().get();
    assertThat(r.getStatusInfo()).isEqualTo(Status.UNAUTHORIZED);
  }

  @Test
  public void getSalesReport_authFailed_wrongDigest() throws Exception {
    Response r = authApi.path("sales123")
        .queryParam("user", "userA")
        .queryParam("digest", "incorrectDigest")
        .request()
        .get();
    assertThat(r.getStatusInfo()).isEqualTo(Status.UNAUTHORIZED);
  }

  @Test
  public void getSalesReport_authSucceed_correctDigest() throws Exception {
    Response r = authApi.path("sales123")
        .queryParam("user", "userA")
        .queryParam("digest", DigestAuthExample.getDigestAsString("passwordA", Digest.MD5))
        .request()
        .get();
    assertThat(r.getStatusInfo()).isEqualTo(Status.OK);
  }

}
