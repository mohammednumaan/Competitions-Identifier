// fetching collection of objects from local host 8000 
// (this port contains the parsed csv data)
const fetchEvents = async (callback) => {
  const allEventsJSON = await fetch("http://localhost:8080/eventsData");
  return allEventsJSON.json();
};

export default fetchEvents;
