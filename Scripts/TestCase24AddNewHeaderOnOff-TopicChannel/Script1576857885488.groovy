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

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5 (14)'), 'giabeuu@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (14)'), 'GoUae4B8Jrc=')

WebUI.click(findTestObject('Page_Mattermost/button_Sign in (4)'))

WebUI.click(findTestObject('Page_ Town Square - FirstTeam Mattermost/div_Fi (6)'))

WebUI.click(findTestObject('Object Repository/Page_ Town Square - FirstTeam Mattermost/span_Off-Topic'))

WebUI.click(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/span_Add a channel description'))

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_Edit the Channel Header_edit_textbox'), 
    'T')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_T'), 'Th')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_Th'), 'Thi')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_Thi'), 'This')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_This'), 'This ')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_This_1'), 'This i')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_This i'), 'This is')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_This is'), 'This is ')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_This is_1'), 'This is n')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_This is n'), 'This is ne')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_This is ne'), 'This is new')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new'), 'This is new ')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new_1'), 'This is new h')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new h'), 'This is new he')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new he'), 'This is new hea')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new hea'), 'This is new head')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new head'), 'This is new heade')

WebUI.setText(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new heade'), 'This is new header')

WebUI.click(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/button_Save'))

WebUI.closeBrowser()

