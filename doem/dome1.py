from selenium import  webdriver
import time

driver = webdriver.Chrome()
driver.get("http://www.baidu.com")

driver.find_element_by_id('kw').send_keys('qq邮箱')

driver.find_element_by_id('su').click()

time.sleep(3)
driver.find_element_by_xpath('//*[@id="1"]/h3/a[1]/em').click()
time.sleep(2)
handles=driver.window_handles
driver.switch_to_window(handles[1])
driver.switch_to_frame('login_frame')
driver.find_element_by_id('switcher_plogin').click()
driver.find_element_by_id('u').send_keys('1960394332')
driver.find_element_by_id('p').send_keys('wyz123456')
driver.find_element_by_id('login_button').click()
time.sleep(2)
driver.find_element_by_id('composebtn').click()
driver.switch_to_frame('mainFrame')
time.sleep(2)
driver.find_element_by_xpath('//*[@id="toAreaCtrl"]/div[2]/input').send_keys('12345678')
time.sleep(2)
driver.find_element_by_id('subject').send_keys('犬夜叉')
time.sleep(2)
driver.switch_to_frame(driver.find_element_by_xpath('//*[@class="qmEditorIfrmEditArea"]'))
time.sleep(2)
driver.find_element_by_id('/html/body').send_keys('hello world')
#driver.switch_to.parent_frame()
#time.sleep(2)
#driver.find_element_by_xpath('//*[@id="toolbar"]/div/a[1]')
time.sleep(2)

driver.close()
#回退到上一步

