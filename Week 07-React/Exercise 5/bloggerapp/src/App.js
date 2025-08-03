import './App.css';
import './BloggerColumns.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  return (
    <div className="App" style={{ background: '#f7f9fa', minHeight: '100vh', padding: '40px 0' }}>
      <h1 style={{ textAlign: 'center', marginBottom: '32px', fontWeight: 800, letterSpacing: '1px', color: '#222', fontSize: '2.2rem' }}>
        Blogger Dashboard
      </h1>
      <div className="blogger-columns">
        <div className="blogger-col">
          <CourseDetails />
        </div>
        <div className="blogger-col">
          <BookDetails />
        </div>
        <div className="blogger-col">
          <BlogDetails />
        </div>
      </div>
    </div>
  );
}

export default App;
