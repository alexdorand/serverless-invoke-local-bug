package com.serverless;

import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.event.S3EventNotification;

public class ApiGatewayResponse {

    private S3EventNotification event;

    public S3EventNotification getEvent() {
        return event;
    }

    public void setEvent(S3EventNotification event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "HelloResponse{" +
                "event=" + event +
                '}';
    }
}
