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

WebUI.click(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/span_duy'))

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Write to duy_post_textbox'), 'C')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_C'), 'Ch')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Ch'), 'Cha')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Cha'), 'Chat')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Chat'), 'Chat ')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Chat_1'), 'Chat s')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Chat s'), 'Chat so')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Chat so'), 'Chat som')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Chat som'), 'Chat some')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Chat some'), 'Chat some ')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Chat some_1'), 'Chat some  ')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Chat some (1)'), 'Chat some ')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Chat some_1'), 'Chat some')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Chat some'), 'Chat somet')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Chat somet'), 'Chat someth')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Chat someth'), 'Chat somethi')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Chat somethi'), 'Chat somethin')

WebUI.setText(findTestObject('Object Repository/Page_duy - FirstTeam Mattermost/textarea_Chat somethin'), 'Chat something')

WebUI.closeBrowser()

