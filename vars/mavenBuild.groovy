import main.mvnBuild

def call() {
	def mvnbuild = new mvnBuild(this)
	mvnbuild.build()
}
