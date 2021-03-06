package dev.xethh.libs.toolkits.webDto.core.response.err;

public class ResponseError {
    private String code;
    private String message;

    public ResponseError() {
    }

    public ResponseError(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
