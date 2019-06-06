$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Launch.feature");
formatter.feature({
  "line": 1,
  "name": "Launching the browsers",
  "description": "",
  "id": "launching-the-browsers",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify user is launching the website on chrome browser",
  "description": "",
  "id": "launching-the-browsers;verify-user-is-launching-the-website-on-chrome-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am launching the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Website_Steps.i_am_launching_the_chrome_browser()"
});
formatter.result({
  "duration": 4081624724,
  "status": "passed"
});
formatter.after({
  "duration": 108658,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality in Tekagogo",
  "description": "",
  "id": "login-functionality-in-tekagogo",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am launching the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I am loading the website",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I wait for page to load",
  "keyword": "Then "
});
formatter.match({
  "location": "Website_Steps.i_am_launching_the_chrome_browser()"
});
formatter.result({
  "duration": 3219265645,
  "status": "passed"
});
formatter.match({
  "location": "Website_Steps.i_am_loading_the_website()"
});
formatter.result({
  "duration": 399537949,
  "status": "passed"
});
formatter.match({
  "location": "Website_Steps.i_wait_for_page_to_load()"
});
formatter.result({
  "duration": 5000265102,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verifiy login feature with valid credentials",
  "description": "",
  "id": "login-functionality-in-tekagogo;verifiy-login-feature-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I click on identifier with xpath \"/html/body/h3[1]/a\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on identifier \"email\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I clear the text in the identifier \"email\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I enter \"sancli1@mailinator.com\" in identifier \"email\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click on identifier \"password\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I clear the text in the identifier \"password\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I enter \"Teka@12\" in identifier \"password\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I click on identifier with xpath \"/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[2]/button\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I assert for the element with xpath \"//*[@id\u003d\u0027navbarTekagogo\u0027]/div/a[4]/a/div/div\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I mouseover on the element with xpath \"//*[@id\u003d\u0027root\u0027]/nav/a/img\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "/html/body/h3[1]/a",
      "offset": 34
    }
  ],
  "location": "Website_Steps.i_click_on_identifier_with_xpath(String)"
});
formatter.result({
  "duration": 1923903738,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "email",
      "offset": 23
    }
  ],
  "location": "Website_Steps.i_click_on_identifier(String)"
});
formatter.result({
  "duration": 73448085,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "email",
      "offset": 36
    }
  ],
  "location": "Website_Steps.i_clear_the_text_in_the_identifier(String)"
});
formatter.result({
  "duration": 32049484,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sancli1@mailinator.com",
      "offset": 9
    },
    {
      "val": "email",
      "offset": 48
    }
  ],
  "location": "Website_Steps.i_enter_in_identifier(String,String)"
});
formatter.result({
  "duration": 160585341,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 23
    }
  ],
  "location": "Website_Steps.i_click_on_identifier(String)"
});
formatter.result({
  "duration": 60153725,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 36
    }
  ],
  "location": "Website_Steps.i_clear_the_text_in_the_identifier(String)"
});
formatter.result({
  "duration": 31628506,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Teka@12",
      "offset": 9
    },
    {
      "val": "password",
      "offset": 33
    }
  ],
  "location": "Website_Steps.i_enter_in_identifier(String,String)"
});
formatter.result({
  "duration": 71188459,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[2]/button",
      "offset": 34
    }
  ],
  "location": "Website_Steps.i_click_on_identifier_with_xpath(String)"
});
formatter.result({
  "duration": 64854453,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//*[@id\u003d\u0027navbarTekagogo\u0027]/div/a[4]/a/div/div",
      "offset": 37
    }
  ],
  "location": "Website_Steps.i_assert_for_the_element_with_xpath(String)"
});
formatter.result({
  "duration": 5023317042,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027navbarTekagogo\u0027]/div/a[4]/a/div/div\"}\n  (Session info: chrome\u003d74.0.3729.169)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-NV8EM8G\u0027, ip: \u0027192.168.0.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_212\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\sanke\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:61473}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 74.0.3729.169, webStorageEnabled: true}\nSession ID: 92c4b1a5cecab488b60617121e8ae67b\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027navbarTekagogo\u0027]/div/a[4]/a/div/div}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat website_stepDefinitions.Website_Steps.i_assert_for_the_element_with_xpath(Website_Steps.java:100)\r\n\tat ✽.Then I assert for the element with xpath \"//*[@id\u003d\u0027navbarTekagogo\u0027]/div/a[4]/a/div/div\"(Login.feature:17)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "//*[@id\u003d\u0027root\u0027]/nav/a/img",
      "offset": 39
    }
  ],
  "location": "Website_Steps.i_mouseover_on_the_element_something(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 685257761,
  "status": "passed"
});
});