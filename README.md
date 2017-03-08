Webservice:
-----------
Two frameworks were assessed, SparkJava and Spring Boot.
Both frameworks have nearly identical features when it comes to webservice development. Both allows to create jar files with embedded jetty or tomcat, so they can run and test independently if needed. However, Sprint Boot was selected for following reasons;
Better community support – Most of the issues I face are already answered in StackOverflow
Better learning material – Good tutorials and good quality youtube videos that helps on get started fast

IDE
----
Two Development IDE’s were assessed, Netbean and Spring Tool Suit.
Netbeans was used with SparkJava and SprintToolSuit was used with Sprint Boot. Both IDEs are slightly slow in my machine, but had excellent support for development. Spring Tool Suit was selected for following reasons, eventhough I has past experience with Netbeans,
Make it really easy to run the Maven project and Sprint Boot project from the same code base
Much more intuitive UI
Very good community support

Build Tools
-----------
Two build tools assessed Maven and Gradle.
There were no criteria related to this project. Maven was selected.

Database
--------
To NoSQL databases were assessed. The reason is Mongo does not have a viable Windows 10 installation. The choices assessed were Mongo Atlas (hosted solution) and CouchDB (local installation). CouchDB was selected for following reason,
Mongo Atlas is a production environment, not a development friendly environment
CouchDB as a Spring Data implementation, but it is not available through Maven. It needed to be built from the Git. Instead of going through the database drivers, plan was to use the http access.
CouchDB was populated with seed data. However, this was not implemented since I am out of time.

