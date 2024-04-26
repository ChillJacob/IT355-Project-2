// Chloe Todd
// Sin 8

class Class {
public:
    Class() {
        // constructor stuff
    }

    ~Class() {
        // destructor stuff
    }
};

int main() {
    Class* ptr = new Class();
    delete ptr;
    //delete ptr; // Double freeing memory

    // good practice to null pointers after freeing
    ptr = nullptr;

    return 0;
}
