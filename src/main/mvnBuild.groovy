package main

class mvnBuild implements Serializable {
    def script
    def folder

    mvnBuild(script){
        this.script=script
    }

    def clean(){
        script.mvn 'clean'
    }
    def install(){
        script.mvn 'install'
    }
    def build(){
        clean()
        install()
    }
}
