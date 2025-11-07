==============================
 CHARACTER STREAMS IN JAVA
==============================

1. What Are Character Streams?
------------------------------
- Designed for reading and writing character data (16-bit Unicode).
- Use Reader and Writer classes (abstract) from java.io package.
- Best suited for handling text files (.txt, .csv, etc.).


2. Reader (Abstract Class)
--------------------------
- Used for reading characters from a source.

  Common Methods:
  - int read()               → Reads one character
  - int read(char[] cbuf)    → Reads characters into an array
  - void close()             → Closes the stream

  Subclasses:
  - FileReader               → Reads characters from a file
  - BufferedReader           → Adds buffering; supports readLine()
  - CharArrayReader          → Reads characters from a char array
  - InputStreamReader        → Bridges byte stream to character stream

  Example:
  --------
  FileReader fr = new FileReader("example.txt");
  int ch = fr.read();
  while (ch != -1) {
      System.out.print((char) ch);
      ch = fr.read();
  }
  fr.close();


3. Writer (Abstract Class)
--------------------------
- Used for writing characters to a destination.

  Common Methods:
  - void write(int c)        → Writes one character
  - void write(char[] cbuf)  → Writes an array of characters
  - void write(String str)   → Writes a string
  - void close()             → Closes the stream

  Subclasses:
  - FileWriter               → Writes characters to a file
  - BufferedWriter           → Adds buffering; includes newLine()
  - CharArrayWriter          → Writes to a char array
  - OutputStreamWriter       → Bridges byte stream to character stream

  Example:
  --------
  FileWriter fw = new FileWriter("output.txt");
  fw.write("Hello, character stream!");
  fw.close();


4. Summary Table
----------------
| Concept           | Class                                      | Purpose                              |
| ----------------- | ------------------------------------------ | ------------------------------------ |
| Character Reading | Reader                                     | Reads characters                     |
| Character Writing | Writer                                     | Writes characters                    |
| Subclass Reader   | FileReader / BufferedReader                | File and buffered reading            |
| Subclass Writer   | FileWriter / BufferedWriter                | File and buffered writing            |
| Bridge Classes    | InputStreamReader / OutputStreamWriter     | Connect byte streams to char streams |


5. Byte vs Character Streams
----------------------------
| Feature          | Byte Stream                   | Character Stream              |
| ---------------- | ----------------------------- | ----------------------------- |
| Base Classes     | InputStream, OutputStream     | Reader, Writer                |
| Handles          | Binary data (PDF, images)     | Text data (txt, csv)          |
| Encoding Concern | You handle encoding           | Java handles it automatically |
