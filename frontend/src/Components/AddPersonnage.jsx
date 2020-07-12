import React, { Component } from "react";
import axios from 'axios';
import Table from 'react-bootstrap/Table';
import Card from 'react-bootstrap/Card'
import PersonnagesTableRow from './PersonnagesTableRow';


export default class personnageList extends Component {
constructor(props) {
        super(props)
        this.state = {
          personnages: []
        };
      }

      componentDidMount(){
          axios.get('http://localhost:8081/api/personnage',{ mode: 'cors',credentials: 'include'})
            .then(res => {
                this.setState({
                    personnages: res.data
                })
            })
            .catch((error) => {
                console.log(error + "IDK");
            })
      }

      DataTable(){
          return this.state.personnages.map((res, i) => {
              return <PersonnagesTableRow obj={res} key={i} />;
          });
      }



    render() {
        return (
            
                <Table>
                    <aside>
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>PV</th>
                            <th>XP</th>
                            <th>Fuite</th>
                            <th>Race</th>
                            <th>Classe</th>
                        </tr>
                    </thead>
                    <tbody>
                        {this.DataTable()}
                    </tbody>
                    </aside>
                </Table>
        );
    }

}
