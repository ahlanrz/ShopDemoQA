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

WebUI.click(findTestObject('Object Repository/Search/Page_My Account  ToolsQA Demo Site/a_Search'))

WebUI.setText(findTestObject('Object Repository/Search/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    'jeans')

WebUI.sendKeys(findTestObject('Object Repository/Search/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Search/Page_Search Results for jeans  ToolsQA Demo Site/a_dark blue sinner distress knee high waist_ce9ef7'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Search/Page_dark blue sinner distress knee high wa_1f1384/select_Choose an optionDark Blue'), 
    'dark-blue', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Search/Page_dark blue sinner distress knee high wa_1f1384/select_Choose an option36373840'), 
    '40', true)

WebUI.click(findTestObject('Object Repository/Search/Page_dark blue sinner distress knee high wa_1f1384/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Search/Page_dark blue sinner distress knee high wa_1f1384/a_Search'))

WebUI.setText(findTestObject('Object Repository/Search/Page_dark blue sinner distress knee high wa_1f1384/input_Type and Press Enter to Search_s'), 
    'shirt')

WebUI.sendKeys(findTestObject('Object Repository/Search/Page_dark blue sinner distress knee high wa_1f1384/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Search/Page_Search Results for shirt  ToolsQA Demo Site/a_playboy x missguided plus size grey lips _adf89a'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Search/Page_playboy x missguided plus size grey li_ba0ff0/select_Choose an optionGrey'), 
    'grey', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Search/Page_playboy x missguided plus size grey li_ba0ff0/select_Choose an option404244'), 
    '44', true)

WebUI.click(findTestObject('Object Repository/Search/Page_playboy x missguided plus size grey li_ba0ff0/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Search/Page_playboy x missguided plus size grey li_ba0ff0/span_Cart(4)128.00'))

