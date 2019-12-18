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

WebUI.callTestCase(findTestCase('TestCase1LoginSuccessfully'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_Write to Town Square_post_textbox'), 
    'I')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I'), 'I ')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I_1'), 'I c')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I c'), 'I ch')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I ch'), 'I cha')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I cha'), 'I chat')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I chat'), 'I chat ')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I chat_1'), 'I chat s')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I chat s'), 'I chat so')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I chat so'), 'I chat som')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I chat som'), 'I chat some')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I chat some'), 'I chat somet')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I chat somet'), 'I chat someth')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I chat someth'), 'I chat somethi')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I chat somethi'), 'I chat somethin')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/textarea_I chat somethin'), 'I chat something')

WebUI.click(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/p_I chat something'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/p_I chat something'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/p_I chat something'))

WebUI.closeBrowser()

