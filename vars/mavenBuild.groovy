import main.mvnBuild

def call() {
	def mvnbuild = new MvnBuild (this)
	mvnbuild.build()
}
