# Sample ADF Application

## Prerequisites

- Oracle Database 18c (XE)
- Oracle BPM Quickstart 12c

## Installation

1.- First create a database called *school* using SQL Developer and then run the sql script from the file `db_script.sql`.

2.- Enter a record in the SCHOOL_INFORMATION table.

3.- Then, clone this repository:

```
git clone https://github.com/alexjcm/school-managment-with-adf.git
```

4.- To open the application from JDeveloper click on the **File** > **Open** menu and open the `*.jws` file of the newly cloned repository.

6.- From JDeveloper click on the menu **Window >> Database >> Databases**, then select the newly imported application and right click and select **New Connection** and create a connection called `SchoolConnection` to the *school* database.

## Deployment

From JDeveloper right click on the project and then click **Deploy**.

