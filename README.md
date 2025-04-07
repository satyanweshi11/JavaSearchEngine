<h1>
  <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" alt="Java Logo" height="50">
  Simple Java Search Program
</h1>

<p>
This Java program reads a <code>.txt</code> file line by line, stores each line, splits it into words, and allows the user to search for a word interactively via the console.
</p>

<h2>🔍 Features:</h2>
<ul>
  <li>Reads file using <code>BufferedReader</code></li>
  <li>Stores lines in a <code>List</code> and maps words using <code>HashMap</code></li>
  <li>Performs case-insensitive word search</li>
  <li>Prints a message if the word is found</li>
</ul>

<h2>💻 How to Run:</h2>
<ol>
  <li>Compile the code:
    <pre><code>javac Search/search.java</code></pre>
  </li>
  <li>Make sure your <code>Data.txt</code> file is placed inside the <code>Search</code> directory</li>
  <li>Run the program:
    <pre><code>java Search.search</code></pre>
  </li>
</ol>

<h2>📝 Example Output:</h2>
<pre>
Line 1 content...
Line 2 content...
Enter the word to search.
example
Match Found
</pre>
