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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/span_Cart(4)128.00'))

WebUI.click(findTestObject('Object Repository/Page_Cart  ToolsQA Demo Site/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'), 'ahlan')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_last_name'), 'rezki')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_company'), 'DIKA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/span_Indonesia'), 'ID', false)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_address_1'), 'Jl. Gang Senggol')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 'Jakarta Timur')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/span_DKI Jakarta'), '', false)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_postcode'), '13420')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_phone'), '087713456789')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_email'), 'kanslay@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/button_Place order'))

WebUI.verifyElementText(findTestObject('Object Repository/CheckOut/Page_Checkout  ToolsQA Demo Site/p_Thank you. Your order has been received'), 
    '')

WebUI.closeBrowser()

