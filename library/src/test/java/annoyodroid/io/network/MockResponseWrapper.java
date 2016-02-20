package annoyodroid.io.network;

import okhttp3.ResponseBody;
import retrofit2.Response;

import javax.validation.constraints.NotNull;

class MockResponseWrapper<T> {

  private final Response<T> mResponse;

  public Response<T> getResponse() {
    return mResponse;
  }

  public MockResponseWrapper(final int statusCode, final @NotNull T successfulBody) {
    mResponse = Response.success(successfulBody, new okhttp3.Response.Builder().code(statusCode).build());
  }

  public MockResponseWrapper(final int statusCode, final @NotNull ResponseBody errorBody) {
    mResponse = Response.error(statusCode, errorBody);
  }
}
