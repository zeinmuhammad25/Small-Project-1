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

WebUI.openBrowser(GlobalVariable.url)

WebUI.click(findTestObject('Home/button_buyNow'))

WebUI.setText(findTestObject('shopping_cart/input_name'), GlobalVariable.nama)

WebUI.setText(findTestObject('shopping_cart/input_email'), GlobalVariable.email)

WebUI.setText(findTestObject('shopping_cart/input_phoneNumber'), GlobalVariable.phonenumber)

WebUI.setText(findTestObject('shopping_cart/input_city'), GlobalVariable.city)

WebUI.setText(findTestObject('shopping_cart/input_address'), GlobalVariable.addres)

WebUI.setText(findTestObject('shopping_cart/input_postalCode'), GlobalVariable.postalCode)

WebUI.click(findTestObject('shopping_cart/button_checkout'))

WebUI.click(findTestObject('order_sumarry/button_continue'))

WebUI.click(findTestObject('select_payment/button_credit'))

WebUI.setText(findTestObject('credit_debitCard/input_cartNumber'), GlobalVariable.cartNumber)

WebUI.setText(findTestObject('credit_debitCard/input_expireDate'), GlobalVariable.expireDate)

WebUI.setText(findTestObject('credit_debitCard/input_cvv'), GlobalVariable.cvv)

b = WebUI.getText(findTestObject('Home/data_hargaBarang'))

int barang = Integer.valueOf(b.replace(',', ''))

System.out.println(barang)

double presentasi = 0.1

System.out.println(presentasi)

diskon = (presentasi * barang)

System.out.println(diskon)

int hargaAkhir = barang - diskon

System.out.println(hargaAkhir)

c = WebUI.getText(findTestObject('credit_debitCard/textAmount'))

int amount = Integer.valueOf(c.replace(',', ''))

System.out.println(amount)

assert hargaAkhir == amount

WebUI.click(findTestObject('credit_debitCard/button_payNow'))

WebUI.setText(findTestObject('payment_ticket/Ticket_password'), GlobalVariable.password)

WebUI.click(findTestObject('payment_ticket/button_ok'))

WebUI.closeBrowser()
