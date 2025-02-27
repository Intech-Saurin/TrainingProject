import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.applitools.com/app.html#')

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/span_View Statement'))

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/span_Credit cards'))

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/span_Debit cards'))

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/span_Loans'))

CustomKeywords.'com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow'('Test138')

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/span_Mortgages'))

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/a_Request Increase'))

WebUI.doubleClick(findTestObject('Object Repository/Page_ACME demo app/h6_Your nearest branch closes in 30m 5s'))

CustomKeywords.'com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow'('Test213')

WebUI.click(findTestObject('Object Repository/Page_ACME demo app/span_Pay Now'))

