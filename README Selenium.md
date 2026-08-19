Here is a comprehensive summary of the mock test questions, concepts, and answers covered during our session:
* Navigation (driver.get() vs. driver.navigate().to()): driver.get() is used to open a URL and waits for the entire page to fully load before proceeding with the next commands, whereas driver.navigate().to() loads the URL without waiting for the page to load completely and preserves browser history, allowing navigation methods like back(), forward(), and refresh().
 
* Implicit Waits: An implicit wait tells the WebDriver to poll the DOM for a certain amount of time when trying to find an element or elements if they are not immediately available, establishing a default waiting time across the entire test script.
 
* Exception Handling (try-catch vs. throw): A try-catch block is utilized to handle runtime exceptions gracefully to prevent abnormal test termination and crashes, whereas a throw statement is explicitly used to create and throw custom or standard exceptions during execution.
 
* Window Handling: To manage multiple browser windows or tabs, driver.getWindowHandles() is used to retrieve the unique string identifiers for all open windows, and driver.switchTo().window(handle) is used to target a specific window.
 
* XPath Types (Absolute vs. Relative): Relative XPath is strongly preferred over absolute XPath in automation frameworks because it starts directly from the node of the element using attributes or tags, making it resilient to minor changes in the HTML document structure, unlike absolute XPath which traces the full path from the root node and breaks easily with structural changes.
 
* Dropdown Management (Select class): Dropdowns are handled by instantiating the Select class, passing the web element of the dropdown into its constructor, and utilizing built-in methods such as selectByVisibleText(), selectByValue(), or selectByIndex().
 
* Page Object Model (POM): POM is a design pattern that creates an object repository for web UI elements, where each web page has a corresponding class file containing web elements and actions, promoting code reusability, modularity, and maintainability.

 * Screenshots: To capture screenshots in Selenium, the WebDriver instance is cast to the TakesScreenshot interface, invoking the getScreenshotAs(OutputType.FILE) method to store the image file locally.

 * Frames and IFrames: Frames are handled by switching the driver's focus using driver.switchTo().frame(), specifying the frame by name, ID, or index, and returning to the main page content via driver.switchTo().defaultContent().
 
* Alerts: Alerts (JavaScript pop-ups, confirmation boxes, and prompt boxes) are handled by switching the context using driver.switchTo().alert() and performing actions like .accept(), .dismiss(), or .sendKeys().

 * Explicit Waits: Explicit waits are conditional waits applied to specific elements to wait dynamically for a precise condition (such as elementToBeClickable or visibilityOfElementLocated) to be met before executing the next instruction.
 
* JavaScriptExecutor: This interface executes JavaScript through Selenium WebDriver, allowing automation scripts to interact with elements hidden from standard locators, handle complex browser events, or scroll pages.

 * Actions Class: The Actions class handles complex user interactions like drag-and-drop (dragAndDrop(source, target)), mouse hovering, context clicks, and keyboard actions.

 * findElement() vs. findElements(): findElement() returns a single WebElement and throws a NoSuchElementException if the element is absent, while findElements() returns a list of WebElement instances and returns an empty list safely if no matching elements are found.
 
* ArrayList vs. LinkedList: An ArrayList backs elements with a dynamic array providing fast random access by index, whereas a LinkedList uses a doubly-linked list structure offering efficient insertions and deletions, making ArrayList typically more suitable for storing large sets of web elements retrieved via findElements().

