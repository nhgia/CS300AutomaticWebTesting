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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cs300testautomatic.herokuapp.com/')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5 (22)'), 'giabeuu@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (22)'), 'GoUae4B8Jrc=')

WebUI.sendKeys(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (22)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_ Town Square - FirstTeam Mattermost/span_ChannelsTest'))

WebUI.click(findTestObject('Object Repository/Page_ ChannelsTest - FirstTeam Mattermost/button_giabeuu_CENTER_button_8b3y5ekuc7rw9k_023a4c'))

WebUI.click(findTestObject('Object Repository/Page_ ChannelsTest - FirstTeam Mattermost/button_Pin to channel'))

WebUI.closeBrowser()

