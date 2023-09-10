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

WebUI.navigateToUrl('https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Customer Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_XYZ Bank/select_---Your Name---       Hermoine Grang_6e895b'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_XYZ Bank/strong_Welcome Ron Weasly'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_XYZ Bank/span_Ron Weasly'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_XYZ Bank/strong_0'), '0')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Deposit'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Amount to be Deposited_form-control n_97f4dd'), '100')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Deposit_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_XYZ Bank/span_Deposit Successful'), 'Deposit Successful')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Withdrawl'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Amount to be Deposited_form-control n_97f4dd'), '50000')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Withdraw'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_XYZ Bank/span_Transaction Failed. You can not withdr_4b9636'), 
    'Transaction Failed. You can not withdraw amount more than the balance.')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Transactions'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_XYZ Bank/button_Reset'), 0)

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Reset'))

WebUI.closeBrowser()

