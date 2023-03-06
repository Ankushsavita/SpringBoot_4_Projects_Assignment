# TODO APPLICATION

* Framework : SpringBoot
* Langauge  : Java


* Data Flow :
* 1). Model -> its real world entity which contains the attributes of Real Objects , Basically its class where we made two classes(User , Post)  which contains Data Members , Member functions and toString() method also and here in place of constructor , getter ,setter and toString() method , we are using some annotations with help of dependency just to write lesser code.


* 2). Controller -> its UserController and PostController class which sends the request to the server and here user performs all CRUD operations and based on that request all endpoint or RestAPI created here. and here we will create the TodoService class Object so we can call all service class methods.


* 3). Service -> its UserService and PostService class where all the Business logic written.


* 4). DAO(data access Object) layer -> its layer which helps us to access the data from the database. its placed betweeen service layer and database , and tha layer extends the JpaRepository(Object, Integer) interface which contains some predefined method which helps us to fetch the data and store and data from database.


* 5). Database Design -> i have used MySql database configured with some dependency adding in POM.xml file for Storing data in database.


* Project Summary : with the help of MVC architecture we are able to create Instagram Application using springBoot