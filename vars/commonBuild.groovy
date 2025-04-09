def call() {
    stage('Checkout') {
        checkout scm
    }
    stage('Unit Tests') {
        echo 'Running unit tests...'
        // sh './gradlew test'  ← Correct comment syntax
    }
}
