package main

class mvnBuild implements Serializable {
    def script
    def folder

    mvnBuild(script){
        this.script=script
    }

    def clean(){
        script.echo "Inside Clean Function"
        script.bat "mvn clean"
    }
    def install(){
        script.echo "Inside Install Function"
        script.bat "install"
    }
    def build(){
        script.echo "Inside build Function"
        clean()
        install()
    }
}
