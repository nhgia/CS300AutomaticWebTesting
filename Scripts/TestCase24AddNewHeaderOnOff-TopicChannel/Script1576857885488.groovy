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

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5 (49)'), 'giabeuu@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (49)'), 'GoUae4B8Jrc=')

WebUI.click(findTestObject('Page_Mattermost/button_Sign in (36)'))

WebUI.click(findTestObject('Page_ Town Square - FirstTeam Mattermost/div_Fi (19)'))

WebUI.click(findTestObject('Page_ Town Square - FirstTeam Mattermost/a_Off-Topic (3)'))

WebUI.click(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/span_Add a channel description (1)'))

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Edit the Channel Header_edit_textbox (1)'), 
    'T')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_T (1)'), 'Th')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Th (1)'), 'Thi')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Thi (1)'), 'This')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This (1)'), 'This ')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This_1 (1)'), 'This i')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This i (1)'), 'This is')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is (1)'), 'This is ')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is_1 (1)'), 'This is n')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is n (1)'), 'This is ne')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is ne (1)'), 'This is new')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new (1)'), 'This is new ')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new_1 (1)'), 'This is new h')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new h (1)'), 'This is new he')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new he (1)'), 'This is new hea')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new hea (1)'), 'This is new head')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new head (1)'), 'This is new heade')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new heade (1)'), 'This is new header')

WebUI.click(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/button_Save (6)'))

WebUI.click(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/span_giabeuu updated the channel header to _886125'))

WebUI.closeBrowser()

