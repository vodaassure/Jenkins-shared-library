def call() {
    sh '''
        trivy fs . -o results.json
        echo "Build scan is done by trivy"
    '''
}
