# 📝My Journal App

A personal **Journal Android App** built with **Firebase** and **Android Studio (Java)**.  
Users can sign up, log in, create journal entries with images, and view their posts — all synced to the cloud with **Firebase Firestore** and **Firebase Storage**.

---

## 🚀 Features

✅ **Firebase Authentication** — User login, sign up, and sign out functionality.  
✅ **Firestore Database** — Stores journal posts (title, thoughts, image URL, date).  
✅ **Firebase Storage** — Upload and retrieve images from the gallery.  
✅ **RecyclerView** — Displays all journal entries in a clean scrollable list.  
✅ **Floating Action Button (FAB)** — Opens screen to add a new journal entry.  
✅ **Menu Options** — Includes sign-out functionality for the logged-in user.  

---

## 🧱 Tech Stack

| Component | Technology Used |
|------------|----------------|
| Language | Java |
| IDE | Android Studio |
| Database | Firebase Firestore |
| Storage | Firebase Storage |
| Authentication | Firebase Auth |
| UI | XML Layouts, RecyclerView, CardView |

---

## 📲 App Flow

1️⃣ **Login / Signup Screen**  
→ Users can register and sign in using Firebase Authentication.  
2️⃣ **Journal List Screen**  
→ Displays all saved journals (title, date, image).  
3️⃣ **Add Journal Screen**  
→ User can select an image from the gallery, add a title & thoughts, then upload.  
4️⃣ **Sign Out**  
→ Option available in the top-right menu.

---

## 🖼️ Screenshots

### 🔐 Login / Signup Screen
> _Add your screenshot below_
  <img width="1366" height="768" alt="Image" src="https://github.com/user-attachments/assets/00077938-55c8-46f4-894b-44a39b1e7424" />

---

### 🧾 Main Journal List Screen


<img width="1366" height="768" alt="Image" src="https://github.com/user-attachments/assets/e0515a32-44fd-4ef9-a726-41553539eeb1" />

---

### 🖊️ Add Journal Screen (with Image Upload)


<img width="1366" height="768" alt="Image" src="https://github.com/user-attachments/assets/44cabe2f-e9a7-4051-9266-9ce0ac7d5e4f" />

---

### 🔚 Firebase Firestore Storage Example


<img width="1366" height="768" alt="Image" src="https://github.com/user-attachments/assets/3ffe6b28-1a0d-4cd8-bc1e-2505344ef75f" />


<img width="1366" height="768" alt="Image" src="https://github.com/user-attachments/assets/184ed931-2b5f-49c5-8ba8-d16eafda9fcc" />
---

## ⚙️ How It Works (Concept Overview)

### 🧩 Firebase Authentication
- Handles user signup, login, and logout.  
- Stores user session automatically.

### 🧩 Firebase Firestore
- Stores journal data in a collection named `"Journal"`.  
- Each document contains:
  - `title`
  - `thoughts`
  - `imageUrl`
  - `timeAdded`
  - `userId`

### 🧩 Firebase Storage
- Handles image upload from the gallery.  
- Generates a download URL stored in Firestore.

### 🧩 RecyclerView Adapter
- Displays all journals dynamically from Firestore using a custom adapter (`MyAdapter`).

---

## 🧑‍💻 Code Highlights

- Used **ActivityResultLauncher** for modern gallery image selection.
- Used **Model Class (Journal.java)** to map Firestore data.
- Followed modular coding with helper classes and adapters.

---

## 🏁 Future Improvements
- Add user profile picture.
- Enable edit/delete journal functionality.
- Add offline caching with Room Database.

---

## 💡 Author
**Chirag Sharma**  
📧 [Your Email or Portfolio Link]  
⭐ If you like this project, don’t forget to star the repo!

---

