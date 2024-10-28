package com.liblab.hook;

import java.util.HashMap;
import okhttp3.Request;
import org.junit.Test;

public class CustomHookTest {
  @Test
  public void testBeforeRequest() {
    CustomHook hook = new CustomHook();
    Request request =
        new Request.Builder()
            .url("http://localhost:8080/v1/test")
            .get()
            .addHeader("Content-Type", "application/json")
            .build();

    hook.beforeRequest(request, new HashMap<>());

    // Assert hook applied expected request changes
  }
}
