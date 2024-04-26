// Chloe Todd
// Sin 10

#include <iostream>
#include <cstdlib>
#include <regex>

using namespace std;

void executeCommand(string &command) {
    regex pattern("^[a-zA-Z0-9,.!?\\s]+$");
    if (!regex_match(command, pattern)) {
        cerr << "Command contains unsafe characters!\n";
        return;
    }

    // Execute the specified command using system()
    int exitCode = system(command.data()); // system is only ran with c strings

    if (exitCode == -1)
        perror("Error executing command");
}

int main() {
    string userInput = "I am malicious >:)";
    executeCommand(userInput);

    return 0;
}
