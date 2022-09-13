package main

class mvnBuild implements Serializable {
    def script
    def folder

    mvnBuild(script){
        this.script=script
    }

    def clean(){
        script.echo "Inside Clean Function"
        script.sh "mvn clean install"
    }
    def compile(){
        script.echo "Inside Compile Function"
        script.sh "mvn compile"
    }
    def Package(){
        script.echo "Inside Compile Function"
        script.sh "mvn package"
    }
    def build(){
        script.echo "Inside build Function"
        clean()
        compile()
        Package()
    }
}
