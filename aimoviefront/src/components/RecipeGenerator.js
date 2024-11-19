import React, { useState } from "react";

function RecipeGenerator() {
  const [genre, setGenre] = useState('');
  const [relatedMovies, setRelatedMovies] = useState('');
  const [imdb, setImdb] = useState('');
  const [recommendations, setRecommendations] = useState('');

  const fetchMovieRecommendations = async () => {
    try {
      const response = await fetch(
        `http://localhost:8080/aimovie?genre=${encodeURIComponent(genre)}&relatedmovies=${encodeURIComponent(relatedMovies)}&imdb=${encodeURIComponent(imdb)}`
      );
      const data = await response.text();
      setRecommendations(data);
    } catch (error) {
      console.error("Error generating recommendations: ", error);
    }
  };

  return (
    <div className="container">
      <h2>AI Based Movie Recommendation</h2>
      <div className="input-group">
        <div className="input-field">
          <label>Genre</label>
          <input
            type="text"
            value={genre}
            onChange={(e) => setGenre(e.target.value)}
            placeholder="e.g., Action, Drama"
          />
        </div>
        <div className="input-field">
          <label>Related Movies</label>
          <input
            type="text"
            value={relatedMovies}
            onChange={(e) => setRelatedMovies(e.target.value)}
            placeholder="e.g., Inception, Interstellar"
          />
        </div>
        <div className="input-field">
          <label>IMDb Rating</label>
          <input
            type="text"
            value={imdb}
            onChange={(e) => setImdb(e.target.value)}
            placeholder="e.g., 8.0"
          />
        </div>
      </div>
      <button onClick={fetchMovieRecommendations}>Surprise Me</button>
      <div className="output">
        <pre>{recommendations}</pre>
      </div>
    </div>
  );
}

export default RecipeGenerator;
