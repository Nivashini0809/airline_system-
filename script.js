document.getElementById('bookingForm').addEventListener('submit', async function(event) {
    event.preventDefault();
    
    let from = document.getElementById('from').value;
    let to = document.getElementById('to').value;
    let date = document.getElementById('date').value;

    let response = await fetch(`http://localhost:8080/flights?from=${from}&to=${to}&date=${date}`);
    let seats = await response.json();
    
    let tableBody = document.querySelector("#seatsTable tbody");
    tableBody.innerHTML = ""; // Clear old data
    
    seats.forEach(seat => {
        let row = `<tr>
            <td>${seat.seatNumber}</td>
            <td>${seat.className}</td>
            <td>${seat.recline} inches</td>
        </tr>`;
        tableBody.innerHTML += row;
    });
});
