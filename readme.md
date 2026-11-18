1. Design a class ChineseServlet that outputs Chinese characters to the webpage. 

Requirements are as follows:

·         Create a class named ChineseServlet that extends HttpServlet and overrides the doGet() method.

·         In the doGet() method, use the setContentType() method of the HttpServletResponse object to set the browser encoding to UTF-8.

·         Use the HttpServletResponse object to obtain an output stream and output the Chinese text "JavaWeb程序设计任务教程" to the browser.



2. Write a Servlet that counts how many times the website has been accessed. 

Requirements are as follows:

·         Create a class ShowTimesServlet that extends HttpServlet, and override both doGet and doPost methods.

·         In the doPost method, call the doGet method, and implement the visit-counting logic in doGet.

·         Each time the servlet is requested by a user, the visit counter times should increase by 1.

·         Obtain the ServletContext object and use it to store and retain the visit count between requests.