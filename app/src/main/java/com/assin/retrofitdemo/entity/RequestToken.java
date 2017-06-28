package com.assin.retrofitdemo.entity;

/**
 * Created by Assassin on 2017/6/28.
 */

public class RequestToken{

    /**
     * token_type : Bearer
     * expires_in : 31536000
     * access_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6ImY4MDU4M2M3NTI5YjVkOTcwYzI1ODY0OTA2N2NhNmU1ZWI0Yzk3OGJlYTU0ZDVhM2Q5ZjBiMzM4ZjY4ZTU5ODI1MWMyNjAwMjBkZjBlNzdmIn0.eyJhdWQiOiIzIiwianRpIjoiZjgwNTgzYzc1MjliNWQ5NzBjMjU4NjQ5MDY3Y2E2ZTVlYjRjOTc4YmVhNTRkNWEzZDlmMGIzMzhmNjhlNTk4MjUxYzI2MDAyMGRmMGU3N2YiLCJpYXQiOjE0OTg2MTQ0NjQsIm5iZiI6MTQ5ODYxNDQ2NCwiZXhwIjoxNTMwMTUwNDY0LCJzdWIiOiIzIiwic2NvcGVzIjpbXX0.i7VrS2QEIHgg-8lVslGOP6IT2V47nvBxDVuqbF1sZbjG3muKH83wDIgl8Y37oVUDPFqRWP2WDeWSZpXyWBR0k829nnIzRjpO8oLkUWndyREM50ksVDs1ojK9lYeIspA-2Y2VcfwZmzU0cgD0bN-Jv_oVEtyqtkofgonEAl9RAWa32tMk9NUKRCrx9jsXlHUew7UOuz5ANkHGciISJKE8Mk58MOdZyIDtX2T1sRTvNWvxzG4-vbJDUnxEuzj90_RRf3ZdUCrpmrgIp2w4z1GJN-M-tQbBWG1aDPLzNgXpR8OZdCWo6_xLXiptIi0zfAu-qsX7vRZQoxLpU0PBgNJ5qfKOKTdJhqPM39ZlKgrTuBfvPgBixAYqx3tAiLIOCCDZX2wnYhBYrIs0slKOIIhalY3GgLrBln6_pAA7nrraJEslWkX_-FwKatr3Dl3fE-b66h6DpFhlf9BmvM14rLXJQxXthbI4JOYEshrO5wJ2tCrypWLUiJcu_Ig_z69ffktDIUbTq6WLXhfIkgkhVK8RgIquA4weIeHQQ-X4UUMHfwMwoEp8sFxfMClei4drtBO7xCo0ZOzdz3NNjO5V_u_PEEXh_X23thHVSpW3DhEtGKHs3bk-wWLcdnby4SdXSkj9sIPeTpbpMkzjHcRDO6ZcORPnv3YJaYAfpM9XSNws9DI
     * refresh_token : 2SMWFD0OBP7rL77fHtIqulhwMA4ou70bMWZycFWTZ1QV6mOrXCgDElYsN21XCbKZF/d+m898xKVMExQY1pWFLNFEDvTUwcVpODAMRG5jT7qlvYLqlTQZ1k2Kmnz18awC0fJbAHd0ZIuHB0ryXCMbstcaGRCWd7/lZXRloBt60TTuhveG7fZjm3mXqCVYu895bkyDmJP4XrWl1XX8430Tzp/IjS9z9lZoynhkEGiVpnO+ujt10j2uOeslHwn6Hh8hJuIJemcmRmCfrbzvFRZWIjcHo9byd3cx8VHFZfO1q6Zj+ZuooJI7Aws8ayW7jFu1CdhkI3J6wZzDgcivrqTeL0G5VlvBsRRvNbKL6V6eR85oNXa77IwrDAVegnFE5gzkAHCHGLJyoJCbRWmWkrPkglpwjKhzLKFbEJMi+R9BARzetYq+M+Lw3bfSOAJLcw7hs1m5WorveNfnHSnNirGzNbDZS3eTE3TPT4FoRrAfTcf7vsUR7Y/PKHvGv+gRZ2SgV8kETNjkhbT0cF/i+8ZUl429CsZsi6DP9PZA1ycPEX2wYy8bg8FKD2X8uXU3w7HbSLF1jVIc7l1D6vFEFefUZgv1xz/fNkVHwu+uURZw1LjUlJACFiShEqUUbWs0vpg/URltwWuqsdaRbNPB+7tUYPppb2bgGN3vieTvBiP+ujs=
     */

    private String token_type;
    private int expires_in;
    private String access_token;
    private String refresh_token;

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    @Override
    public String toString() {
        return "RequestToken{" +
                "token_type='" + token_type + '\'' +
                ", expires_in=" + expires_in +
                ", access_token='" + access_token + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                '}';
    }
}
