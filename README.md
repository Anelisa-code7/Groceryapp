## My Grocery app 🌳
The app is used to help the user order items on the app for their outdoor experience to be more enjoyable and to buy their what they will need to make their fun more comfortable. It is efficient and effective, quick and easy to operate.
## usage 
The splash screen is more like your welcome screen where the user will be welcomed into the app and will be taken to the main screen I 3 seconds 
The main screen the user will be guided to add the gear that they will need such as your tents and goodies. This will also show the amount of stuff the user has add to the cart 
The View screen  will show the list of gear with details: Item, Category, Quantity and the comments. The user will also be able to return back to the main screen whenever.
##Features 
-	The app contains next button to be able to move on the next screen lesser than 3 seconds or they can wait for the 3 second in function
-	Add Gear button 
-	Gear checklist button
-	A back to base button
## reference 
https://towardsdev.com/how-to-add-emojis-to-your-github-readme-and-other-markdown-files-c8f13b3f9de4
https://stackoverflow.com/questions/7991393/how-to-switch-between-screens
https://stackoverflow.com/questions/59514554/how-to-make-multiple-objects-in-android-kotlin-using-for-loop
## link
https://github.com/Anelisa-code7/Groceryapp.git
 
The welcome screen, which allow the user to move on to the next screen in 3 seconds
 
,Main screen on emulator
 
Detailed View Sreen
## pseudocode
// --- DATA STORAGE (parallel arrays, initialized with sample data) ---
Arrays:
    itemNames = ["Tent", "Marshmallows", "Flashlight"]
    categories = ["Shelter", "Food", "Safety"]
    quantities = [1, 3, 1]
    comments = ["4-person waterproof", "For S'mores (Mega size)", "Check batteries (AA)"]

// --- SPLASH SCREEN ---
Display "Campsite Commander" logo and title
Wait 3000 milliseconds
Navigate to Main Screen

// --- MAIN SCREEN ---
Display:
    - "Add Gear" button
    - "View Details" button
    - "Total Items Packed:" label + calculated total

Function calculateTotalItems():
    total = 0
    FOR each quantity in quantities array:
        total = total + quantity
    END FOR
    RETURN total

When "Add Gear" button clicked:
    Navigate to Add Item Screen

When "View Details" button clicked:
    Navigate to Detailed View Screen

On screen load:
    totalItems = calculateTotalItems()
    Display totalItems

// --- ADD ITEM SCREEN ---
Display input fields for:
    - Item name
    - Category
    - Quantity (positive integer)
    - Comments

Display "Save Item" button

When "Save Item" clicked:
    IF name is empty OR quantity <= 0 THEN
        Show error message: "Please enter valid item name and quantity (>0)"
    ELSE
        Append name to itemNames array
        Append category to categories array
        Append quantity to quantities array
        Append comments to comments array
        Show success message: "Item added!"
        Navigate back to Main Screen
    END IF

Display "Back to Base" button to return to Main Screen

// --- DETAILED VIEW SCREEN ---
Display title: "Full Gear List"

FOR i from 0 to length of itemNames - 1:
    Display:
        "Item: " + itemNames[i]
        "Category: " + categories[i]
        "Quantity: " + quantities[i]
        "Comments: " + comments[i]
        "------------------------"
END FOR

Display "Back to Base" button to return to Main Screen

// --- ERROR HANDLING (general) ---
If user tries to add duplicate item name:
    Show warning: "Item already exists. Update quantity instead?" (optional improvement)

If user enters text in quantity field:
    Show error: "Quantity must be a number"

If user tries to view list when empty:
    Show message: "No items yet. Add some gear first!"



