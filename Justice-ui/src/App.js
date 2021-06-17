import Navbar from './components/Navbar';
import React, { useState, useRef, useCallback } from 'react'
import './App.css';
import Home from './components/pages/Home';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import Services from './components/pages/Services';
import InfinityScroll from './components/pages/InfinityScroll';
import Products from './components/pages/Products';
import SignUp from './components/pages/SignUp';


function App() {
  return (
      <>
      <Router>
        <Navbar />
        <Switch>
          <Route path='/' exact component={Home} />
          <Route path='/services' component={Services} />
          <Route path='/products' component={Products} />
          <Route path='/sign-up' component={SignUp} />
          <Route path='/scroll' component={InfinityScroll} />
        </Switch>
      </Router>
    </>
  );
}

export default App;
