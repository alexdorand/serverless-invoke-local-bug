<!--
1. If you have a question and not a bug report please ask first at http://forum.serverless.com
2. Please check if an issue already exists. This bug may have already been documented
3. Check out and follow our Guidelines: https://github.com/serverless/serverless/blob/master/CONTRIBUTING.md
4. Fill out the whole template so we have a good overview on the issue
5. Do not remove any section of the template. If something is not applicable leave it empty but leave it in the Issue
6. Please follow the template, otherwise we'll have to ask you to update it
-->

# This is a Bug Report

## Description
I have created a project with sample code we can run

https://github.com/alexdorand/serverless-invoke-local-bug.git

* What went wrong?
When executing locally it throws ``` java.lang.InstantiationException: com.amazonaws.services.lambda.runtime.events.S3Event ```
* What did you expect should have happened?
For the local invocation to to gets triggered based on S3Event Json
* What was the config you used?
Code is available at: https://github.com/alexdorand/serverless-invoke-local-bug.git
* What stacktrace or error message from your provider did you see?
```
C02TN4JWG8WN:serverless-invoke-local-bug aldor$ sls invoke local -f hello --path local_test/s3-event.json 
Serverless: In order to get human-readable output, please implement "toString()" method of your "ApiGatewayResponse" object.
java.lang.InstantiationException: com.amazonaws.services.lambda.runtime.events.S3Event

	at java.lang.Class.newInstance(Class.java:427)
	at com.serverless.InvokeBridge.invoke(InvokeBridge.java:68)
	at com.serverless.InvokeBridge.<init>(InvokeBridge.java:36)
	at com.serverless.InvokeBridge.main(InvokeBridge.java:133)
Caused by: java.lang.NoSuchMethodException: com.amazonaws.services.lambda.runtime.events.S3Event.<init>()
	at java.lang.Class.getConstructor0(Class.java:3082)
	at java.lang.Class.newInstance(Class.java:412)
	... 3 more

```
The interesting part is I don't even have Object or file ```ApiGatewayResponse.java```
Similar or dependent issues:
* #12345

## Additional Data
 
* ***Steps to reproduce***:
- clone the project using
``` git clone https://github.com/alexdorand/serverless-invoke-local-bug.git```
- run maven:
```mvn clean install```
- run npm:
```npm install```
- execute the handler:
```sls invoke local -f hello --path local_test/s3-event.json```
* ***Serverless Framework Version you're using***:
1.32.0
* ***Operating System***:
Mac OS
* ***Provider Error messages***:
```
C02TN4JWG8WN:serverless-invoke-local-bug aldor$ sls invoke local -f hello --path local_test/s3-event.json 
Serverless: In order to get human-readable output, please implement "toString()" method of your "ApiGatewayResponse" object.
java.lang.InstantiationException: com.amazonaws.services.lambda.runtime.events.S3Event

	at java.lang.Class.newInstance(Class.java:427)
	at com.serverless.InvokeBridge.invoke(InvokeBridge.java:68)
	at com.serverless.InvokeBridge.<init>(InvokeBridge.java:36)
	at com.serverless.InvokeBridge.main(InvokeBridge.java:133)
Caused by: java.lang.NoSuchMethodException: com.amazonaws.services.lambda.runtime.events.S3Event.<init>()
	at java.lang.Class.getConstructor0(Class.java:3082)
	at java.lang.Class.newInstance(Class.java:412)
	... 3 more

```
