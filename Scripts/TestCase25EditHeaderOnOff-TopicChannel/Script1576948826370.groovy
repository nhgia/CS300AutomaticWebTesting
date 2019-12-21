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

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5 (50)'), 'giabeuu@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (50)'), 'GoUae4B8Jrc=')

WebUI.click(findTestObject('Page_Mattermost/button_Sign in (37)'))

WebUI.click(findTestObject('Page_ Town Square - FirstTeam Mattermost/div_Fi (20)'))

WebUI.click(findTestObject('Page_ Town Square - FirstTeam Mattermost/a_Off-Topic (4)'))

WebUI.click(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/button_Off-Topic'))

WebUI.click(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/button_Edit Channel Header (5)'))

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new header (1)'), 'This is new heade')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new heade (2)'), 'This is new head')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new head (2)'), 'This is new hea')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new hea (2)'), 'This is new he')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new he (2)'), 'This is new h')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new h (2)'), 'This is new ')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new (2)'), 'This is new')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is new_1 (2)'), 'This is ne')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is ne (2)'), 'This is n')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is n (2)'), 'This is ')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is (2)'), 'This is')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This is_1 (2)'), 'This i')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This i (2)'), 'This ')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This (2)'), 'This')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_This_1 (2)'), 'Thi')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Thi (2)'), 'Th')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Th (2)'), 'T')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_T (2)'), '')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Edit the Channel Header_edit_textbox (2)'), 
    'E')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_E (4)'), 'Ed')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Ed (4)'), 'Edi')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Edi (4)'), 'Edit')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Edit (4)'), 'Edite')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Edite (4)'), 'Edited')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Edited (4)'), 'Edited ')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Edited_1 (4)'), 'Edited H')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Edited H (4)'), 'Edited He')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Edited He (4)'), 'Edited Hea')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Edited Hea (4)'), 'Edited Head')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Edited Head (4)'), 'Edited Heade')

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Edited Heade (4)'), 'Edited Header')

WebUI.click(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/button_Save (7)'))

WebUI.click(findTestObject('Object Repository/Page_ Off-Topic - FirstTeam Mattermost/span_giabeuu updated the channel header fro_b79c5b'))

WebUI.closeBrowser()

