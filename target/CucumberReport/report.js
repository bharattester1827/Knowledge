$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Knowledge/KnowledgeTraining/knowledge.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10137091921,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Home Page and login",
  "description": "",
  "id": ";home-page-and-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@homepage"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "checking on checkbox",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "enter login details",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "homepage load",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefini.checking_on_checkbox()"
});
formatter.result({
  "duration": 2044659841,
  "error_message": "org.openqa.selenium.interactions.MoveTargetOutOfBoundsException: Cannot click on element\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:05:20.749Z\u0027\nSystem info: host: \u0027WGMQ37-10-9928\u0027, ip: \u002710.132.97.26\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.2\u0027\nDriver info: org.openqa.selenium.ie.InternetExplorerDriver\nCapabilities {acceptInsecureCerts: false, browserName: internet explorer, browserVersion: 11, javascriptEnabled: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:ieOptions: {browserAttachTimeout: 0, elementScrollBehavior: 0, enablePersistentHover: true, ie.browserCommandLineSwitches: , ie.ensureCleanSession: false, ie.fileUploadDialogTimeout: 3000, ie.forceCreateProcessApi: false, ignoreProtectedModeSettings: false, ignoreZoomSetting: false, initialBrowserUrl: http://localhost:18146/, nativeEvents: true, requireWindowFocus: false}, setWindowRect: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}}\nSession ID: ea265b5f-a598-46dc-a004-0a93a837cc93\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat Knowledge.KnowledgeTraining.Utils.ClickOnElement(Utils.java:10)\r\n\tat Knowledge.KnowledgeTraining.HomePage.tnccheckboxclick(HomePage.java:20)\r\n\tat Knowledge.KnowledgeTraining.StepDefini.checking_on_checkbox(StepDefini.java:12)\r\n\tat ✽.Given checking on checkbox(src/test/java/Knowledge/KnowledgeTraining/knowledge.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefini.enter_login_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefini.homepage_load()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1710435419,
  "status": "passed"
});
});