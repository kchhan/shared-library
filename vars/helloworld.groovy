def call(Map config) {
    sh "echo Hello world two, ${config.name}"
}