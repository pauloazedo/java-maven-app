def buildApp() {
    echo 'building the application... Groovy...'
}

def testApp() {
    echo 'testing the application... Groovy...'
}

def deployApp() {
    echo 'deploying the application... Groovy...'
    echo "deploying version ${params.VERSION}"
}

return this
