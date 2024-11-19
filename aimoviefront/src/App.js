import React, { useState } from "react";
import "./App.css";

function App() {
  const [advancedAI, setAdvancedAI] = useState(false);

  const handleToggle = () => {
    setAdvancedAI(!advancedAI);
  };

  return (
    <div className="app-container">
      <header>
        <h1 className="title">Movie Recommender</h1>
        <p className="subtitle">
          Get AI-powered movie recommendations based on your favorite movies
          and TV shows
        </p>
      </header>
      <main>
        <div className="form-container">
          <input
            type="text"
            placeholder="Movies or TV shows you like"
            className="input-field"
          />
          <input
            type="text"
            placeholder="Preferred genre"
            className="input-field"
          />
          {/* IMDb Rating Section */}
          <div className="imdb-container">
            <label className="imdb-label">Minimum IMDb rating</label>
            <input
              type="number"
              placeholder="e.g., 7.0"
              className="input-field"
              min="0"
              max="10"
              step="0.1"
            />
          </div>
          <div className="toggle-container">
            <label className="toggle-label">
              Use advanced AI model
              <span className="best-results">Best Results</span>
            </label>
            <input
              type="checkbox"
              className="toggle-switch"
              checked={advancedAI}
              onChange={handleToggle}
            />
          </div>
          <button className="generate-btn">Generate</button>
          <button className="clear-btn">Clear inputs</button>
        </div>
      </main>
      <footer>
        <div className="footer-text">
          <span>Powered by best AI models</span>
          <span>Supports 40+ languages</span>
          <span>varun6465</span>
          <span>anime also avaliable</span>
        </div>
      </footer>
    </div>
  );
}

export default App;
