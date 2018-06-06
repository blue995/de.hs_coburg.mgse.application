# Instructions
## Getting started
1. Get [IntelliJ IDEA Ultimate](https://www.jetbrains.com/idea/download/) (Get your **student licence**: [here](https://www.jetbrains.com/student/))
2. Open `restapi` project in IntelliJ

## Import dependencies
1. Right click on `pom.xml`
2. Execute `Maven` => `Reimport` (wait)

## Setting up servers
1. CTRL + ALT + S (Open *Settings*)
2. *Build, Execution, Deployment* => *Application Servers*
3. `+` => *Tomcat Server*
4. Tomcat Home: `<your_path_to_this_repo>/servers/apache-tomcat-8.X.XX`
5. Ok => Apply => Ok

## Setting up execution config
We have to setup 2 things:
- Maven building the RESTful API (war file)
- Tomcat using Maven and deploying the war file

### Maven Build
1. Run (Menu Bar) => Edit Configurations...
2. `+` => Maven
3. Name: `BuildRestapi`
4. Command line: `package`
5. Apply => Ok

### Tomcat using Maven
1. Run (menu Bar) => Edit Configurations... (You should see *Maven/BuildRestapi* in your side bar)
2. `+` (side Bar) => Tomcat Server => Local
3. Choose any name for this configuration
4. Open the *Deployment* tab of your Tomcat configuration
5. `+` (*Deploy at the server startup*) => *Artifact...* => Select `restapi:war`
6. `+` (*Before launch:...*) => Run Another Configuration => Select `BuildRestapi`
7. Remove `restapi:war` from (*Before launch:...*) section with `-`
8. Apply => Ok

