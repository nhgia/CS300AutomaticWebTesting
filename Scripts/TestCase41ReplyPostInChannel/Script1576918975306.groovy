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

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5'), 'dhieu@apcs.vn')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), 'iGDxf8hSRT4=')

WebUI.sendKeys(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Town Square - FirstTeam Mattermost/a_Off-Topic'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/button_hieu_CENTER_button_uz63gsxba7n9ubyrh_2a30c3'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/button_Reply'))

WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/textarea_Add a comment_reply_textbox'), 
    'R')

WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/textarea_R'), 'Re')

WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/textarea_Re'), 'Rel')

WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/textarea_Rel'), 'Rely')

WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/textarea_Rely'), 'Rely ')

WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/textarea_Rely_1'), 'Rely t')

WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/textarea_Rely t'), 'Rely te')

WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/textarea_Rely te'), 'Rely tes')

WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/textarea_Rely tes'), 'Rely test')

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/input_Help_btn btn-primary comment-btn pull-right'))

WebUI.closeBrowser()

