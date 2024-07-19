# Srinithya-POS-Assessment
Iam srinithya i have completed the assessment give to me by recruiter and attached it. Please find the file.
I am writing a readable form of my code here.

=> Initial annotation @BeforeMethod is used to run the method before every test method. The methods sets up browser.

TASK 1:
1)@Test annotation is used to annotate method as a test as per testng.
2) chrome driver is initialized.
3) windiow mazimized.
4) i was getting a ad few times when i logged into the website hence i used try catch block to eliminate add when every it is visible.
5)Buy Insurance button is found with help of relative xpath.
6)A javascript executer is used to scroll untill Buyinsurance button is found.
7)I also used robot class to scroll back since the button hides behind header when scrolling and when tryingng to click click interupted exception was thrown.
8) With getWindowHandles i got the windows handle and used iterator to move to the newly open tab and the url of the newly open tab is verified using assertEquals.
9) Find element methods is used to test if "i drive a car" button is clickable and clicked.
10) assert true is used along with isDiplayed() method to verify if all the 5 tags in the page are displayed.

TASK 2:
1)1)@Test annotation is used to annotate method as a test as per testng.
2) chrome driver is initialized.
3) windiow mazimized.
4) i was getting a ad few times when i logged into the website hence i used try catch block to eliminate add when every it is visible.
5) The element send is found using xpath.
6) mouse hover is achieved with moveToElement method on send button.
7) parcel button is found using linktext method which was present when send button is hovered.
8)Then create shipment now butoon is found.
9) Javascript executor is used to scroll the page untill Create shipment now button is visible.
10)I also used robot class to scroll back since the button hides behind header when scrolling and when tryingng to click click interupted exception was thrown.
11)The Create shipment now button is clicked.
12)assert Equals is used to verify the current url.
13)assert True is used to verify if the forms "Sender","receiver","parcel","summary" is displayed with isDisplayed method.
  
