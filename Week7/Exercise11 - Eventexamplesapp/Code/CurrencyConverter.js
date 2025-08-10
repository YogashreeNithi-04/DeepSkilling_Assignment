import React, { useState } from 'react';

const CurrencyConverter = () => {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('Euro');

  const handleSubmit = (e) => {
    e.preventDefault();
    let convertedAmount;

    if (currency === 'Euro') {
      convertedAmount = amount * 80;
    } else {
      convertedAmount = amount;
    }

    alert(`Converting to ${currency} Amount is ${convertedAmount}`);
  };

  return (
    <div>
      <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>

      <form onSubmit={handleSubmit}>
        <label>
          Amount:
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </label>

        <br /><br />

        <label>
          Currency:
          <select value={currency} onChange={(e) => setCurrency(e.target.value)}>
            <option value="Euro">Euro</option>
            <option value="USD">USD</option>
            <option value="Yen">Yen</option>
          </select>
        </label>

        <br /><br />

        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default CurrencyConverter;