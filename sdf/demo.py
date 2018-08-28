import time
from selenium import webDriver;

driver = webDriver.chrome("/home/ANANDA/Downloads/chromedriver")
driver.get("https://www.facebook.com/")
print (driver.title)
time.sleep(8)
driver.quite()


