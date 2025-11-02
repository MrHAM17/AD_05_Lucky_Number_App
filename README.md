## AD_05_Lucky_Number_App

### 📱 Short Description

Application that receives user input (name), generates a **random lucky number**, and allows the user to **share the result** via other applications installed on the device.

---

### 🧩 Concepts Covered

* **Explicit Intents** (for navigating to a specific internal component/Activity)
* **Implicit Intents** (for requesting actions handled by other applications)
* **Passing Data** between activities using `Intent.putExtra()` (key-value pairs)
* **Random class** (Java utility for generating random numbers)
* `Intent.ACTION_SEND` and `Intent.createChooser`

---

### 🎯 Learning / Discovery Points

* Using the **`putExtra`** method to package data (username) with an explicit Intent for the destination activity.
* Retrieving the passed data in the destination activity using **`getIntent().getStringExtra()`**.
* Utilizing the **`Random`** class and `nextInt()` method to generate a number within a set limit (e.g., up to 1000).
* Implementing the sharing functionality using `ACTION_SEND` and optionally pre-populating the subject/text fields via `Intent.EXTRA_SUBJECT` and `Intent.EXTRA_TEXT`.

---

### ⚙️ App Features / Usage

* User inputs their name in the main activity.
* Navigates to a second activity where a random "lucky number" is displayed.
* A Share button initiates an Android Intent Chooser, allowing the user to select an app (like Email or Messaging) to share the result.

---

### 📝 Note

This app is vital for understanding the concept of **Intents**, which are the fundamental mechanism for communication and interaction within and across different Android applications.

---
